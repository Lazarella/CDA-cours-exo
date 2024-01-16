// TP 3

use ("book"); 

//db.livres.find({type: "Book"}); 

// db.livres.find({year: {$gte: 2011}}); 

//db.livres.find({type:"Book", year: {$gte: 2014}}); 

//db.livres.find({authors:"Toru Ishida"}); 

//db.livres.find({},{publisher: 1, _id: 0}).count();

db.livres.distinct("publisher"); 

//db.livres.find({}, { authors: 1, _id: 0 }); 


//db.livres.find(); 