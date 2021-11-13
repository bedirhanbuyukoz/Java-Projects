public class FilmManager {

	public void add(Film film) {

		System.out.printf("Listeye Eklenen Film: %s \n", film.name);
		
	}

	public void showInfo(Film film) {
		System.out.println("************************");
		System.out.println("Film ID : " + film.id + "\n" + "Film ismi : " + film.name + "\n" + "Film Türü: "+ film.type + "\n" + "Çıkış tarihi : " + film.year + "\n" + "IMDB Puanı : " + film.imdb);

	}

}