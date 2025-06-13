package org.example.exo6.ressource;

import jakarta.inject.Inject;
import jakarta.inject.Qualifier;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.exo6.entity.Car;
import org.example.exo6.service.CarService;

import java.time.LocalDate;
import java.util.List;

@Path("/car")
public class CarRessource {

    private CarService carService;
    private List<Car> cars;

    @Inject
    public CarRessource(CarService carService) {
        this.carService = carService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Car carCreator() {
        return new Car(1,"Volkswagen", LocalDate.of(01,01,2000),"Blue");

    }

    @GET
    @Path("/carlist")
    public List<Car> cars() {
        return cars();
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car postCar(Car car) {
        car.setId(20);
        return car;
    }

    @POST
    @Path("/withservice")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car postCarWithService() {
        return carService.save(33, "BMW", LocalDate.parse("01-01-2000"),"Red");
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/params")
    public Car postCarWithParams(@QueryParam("brand") String brand, @QueryParam("fabricationDate") LocalDate fabricationDate, @QueryParam("color") String color) {
        return carService.save(8, brand, fabricationDate, color);
    }

    @PATCH
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car patchCar(Car car) {

return car.update(id,brand,fabricationDate,color);
    }

    @DELETE
    @Path("/delete/{id}")
    public int delete(@PathParam("id") int id) {
        return id;
    }




}