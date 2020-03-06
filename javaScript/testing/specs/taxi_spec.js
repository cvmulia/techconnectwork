const assert = require ('assert');

const Taxi = require ('../Taxi.js');


describe ("Taxi", function(){

  let taxi;
  beforeEach(function(){
    taxi = new Taxi ("Toyota","Prius");
  })



  it('Should have a manufacturer', function (){
      const actual = taxi.manufacturer;
      assert.strictEqual(actual, "Toyota");
  });


  it ('Should have a model', function (){
    const actual = taxi.model;
    assert.strictEqual(actual, "Prius");
  });


});
