use ("demo"); 


//db.users.insertOne({ name: "Chuck Norris", age: 77, hobbies: ["Karate", "Kung-fu", "Ruling the world"] })

//db.users.find({name: "Chuck Norris"}); 

//db.users.find({ name: "Chuck Norris" }, { _id: 0 });

//db.users.find({ age: { $gte: 20, $lte: 25 } });

//db.users.find({$and: [{gender:"male"}, { age: { $gte: 20, $lte: 25 } }]} );

//db.users.find({ "address.state": "Louisiana" }); 

//db.users.find().limit(20).sort({age: -1}); 

//db.users.find({age:30, gender:"female"}).count(); //63

// 3 - Modifier/Supprimer un élément

//db.users.updateMany({$unset:{phone:""}}); 

//db.users.updateOne({name: "Chuck Norris"}, {$set{age: "infinity"}})

//db.users.updateMany({age:{$gte:50}, {$push: {hobbies: "gardening"}})

//db.users.find();