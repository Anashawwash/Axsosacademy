const express = require("express");
const app = express();
const port = 8000;
const { faker } = require('@faker-js/faker');



class User {
    constructor() {
        this.id = faker.string.uuid();
        this.firstName = faker.person.firstName();
        this.lastName = faker.person.lastName();
        this.phoneNumber = faker.phone.number();
        this.email = faker.internet.email();
        this.password = faker.internet.password();
    }
}
class Company {
    constructor() {
        this.id = faker.string.uuid();
        this.name = faker.company.name();
        this.address = {
            street: faker.location.streetAddress(),
            city: faker.location.city(),
            state: faker.location.state(),
            zipCode: faker.location.zipCode(),
            country: faker.location.country()
        };
    }
}

app.get("/api/user/new", (req, res) => {
    const newUser = new User();
    res.json(newUser);
});
app.get("/api/company/new"),(req,res) =>{
    const newCompany = new Company();
    res.json(newCompany)
}
app.get("/api/new/all"),(req,res) =>{
    const newUser = new User();
    const newCompany = new Company();
    const data = [newUser,newCompany]
    res.json(data);
}
app.listen(port, console.log("listening to port "+port))