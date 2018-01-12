const Anime = require('../models/Anime');

module.exports = {
	index: (req, res) => {
        //TODO: Implement me ...


        Anime.find().then(animes => {
            return res.render('anime/index', {'animes': animes});
        }).catch(err => {
            return res.send("error");
        });
	},
	createGet: (req, res) => {
        //TODO: Implement me ...

        res.render('anime/create');
	},
	createPost: (req, res) => {
        //TODO: Implement me ...

        let anime = req.body;
        Anime.create(anime).then(anime => {
            res.redirect("/");
        }).catch(err => {
            anime.error = 'Cannot create anime.';
            res.render('anime/create', anime);
        });
	},
	deleteGet: (req, res) => {
        //TODO: Implement me ...

        let id = req.params.id;
        Anime.findById(id).then(anime => {
            if (anime) {
                return res.render('anime/delete', anime);
            }
            else {
                return res.redirect('/');
            }
        }).catch(err => res.redirect('/'));
	},
	deletePost: (req, res) => {
        //TODO: Implement me ...

        let id = req.params.id;
        Anime.findByIdAndRemove(id).then(data => {
            res.redirect('/');
        }).catch(err => res.redirect('/'));
	}
};