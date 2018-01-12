const mongoose = require('mongoose');

let animeSchema = mongoose.Schema({
    //TODO: Implement me ...

    rating: {type: 'number', required: 'true'},
    name: {type: 'string', required: 'true'},
    description: {type: 'string', required: 'true'},
    watched: {type: 'string', required: 'true'},

});

let Anime = mongoose.model('Anime', animeSchema);

module.exports = Anime;