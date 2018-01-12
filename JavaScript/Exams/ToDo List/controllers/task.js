const Task = require('../models/Task');

module.exports = {
    index: (req, res) => {
		res.render('task/index', {'tasks': null});
    },
	createGet: (req, res) => {
	},
	createPost: (req, res) => {
	},
	deleteGet: (req, res) => {
	},
	deletePost: (req, res) => {
	}
};
