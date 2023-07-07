module.exports = function(application){
	application.get('/formulario_inclusao_noticia', function(req, res){
		res.render("admin/form_add_noticia");	
	});

	application.post('/noticias/salvar', function(req, res){
		//res.render("admin/form_add_noticia");	
		var noticia = req.body;
		
		var connection = application.config.dbConnection();
		var noticiasModel = new application.app.models.NoticiasDAO(connection);

		noticiasModel.salvarNoticia(noticia, function(error, result){
			// res.render("noticias/noticias", {noticias : result});
			res.redirect('/noticias');
		});	
	});
}