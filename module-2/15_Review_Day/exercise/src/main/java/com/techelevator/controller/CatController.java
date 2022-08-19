package com.techelevator.controller;

import com.techelevator.dao.CatCardDao;
import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardNotFoundException;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/cards")
public class CatController {

    private CatCardDao catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDao catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<CatCard> list(){
        return catCardDao.list();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public CatCard get(@PathVariable long id) throws CatCardNotFoundException {
        return catCardDao.get(id);
    }

    @RequestMapping(path = "/random", method = RequestMethod.GET)
        public CatCard random(){
        CatCard catCard = new CatCard();
        CatPic pic = catPicService.getPic();
        CatFact fact = catFactService.getFact();
        catCard.setImgUrl(pic.getFile());
        catCard.setCatFact(fact.getText());
        return catCard;

    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "", method = RequestMethod.POST)
    public boolean addCat(@RequestBody CatCard catCard) throws CatCardNotFoundException{
        return catCardDao.save(catCard);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable long id, @RequestBody CatCard catCard) throws CatCardNotFoundException{
        catCardDao.update(id, catCard);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path ="/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) throws CatCardNotFoundException{
        catCardDao.delete(id);
    }

}
