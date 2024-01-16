use("book"); 
//db.books.find(); 

// Read

//db.books.find({_id:45});

//db.books.find().limit(5);  //Limite le nombre de réponses (ici à 5)

//db.books.find({authors:{$size:2}});  //va afficher 

//db.books.find({pageCount:{$gte: 400}});

//db.books.find({_id:{$in:[45, 55]}}); // attention, ce n'est pas un interval

//db.books.find({authors:{$size:2}}).sort({title:1, _id:-1})//.count(); // tri par ordre ascendant ou descendant

//db.books.find({authors:{$size:2}}).skip(10).sort({title:1, _id:-1}).limit(3); // fait sauter les 10 premières réponses

//db.books.find({ $and: [{ _id: { $gte: 25 } }, { _id: { $lt: 50 } }] });

//db.books.find({_id: {$gt:45}}, {_id:1, authors:1}); //projection
//db.books.find({_id: {$gt:45}}, {_id:1, authors:0}); //projection

// db.books.find({categories: {$in :['Java', 'Web Development']}}); 

//db.books.find({categories: {$all :['Java', 'Web Development']}}); // doit contenir les deux catégories

//db.books.find({$or: [{_id:19}, {_id:55}]}); 

//db.books.find({longDescription:{$regex: "^ext", $options:"i"}}); 

//db.books.find({longDescription:{$regex: "Distributed", $options:"i"}}); 

//db.books.find({title:{$regex: "Pers$", $options:"i"}}); // qui finit par "pers", l'option "i" rend la requête insensible à la casse.
