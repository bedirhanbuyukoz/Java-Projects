public class Main {

	public static void main(String[] args) {

		Film film1 = new Film(1, "A Filmi", "Suç", 2001, 7.1);
		Film film2 = new Film(2, "B Filmi", "Gerilim", 2005, 8.2);
		Film film3 = new Film(3, "C Filmi", "Aksiyon", 2019, 7.4);

		Film[] films = { film1, film2, film3 };
		
			
		for (Film film : films) {
			System.out.println(film.name);
		}
		
		Category category1 = new Category(1, "Suç");
		
		Category category2 = new Category(2,"Gerilim");
		
		Category category3 = new Category(3,"Aksiyon");
		
		Category[] categories = {category1 , category2 , category3};
		
		CategoryManager categoryManager = new CategoryManager();
		
		
		
		for (Category category : categories) {
			categoryManager.showCategories(category);
		}
		
		FilmManager filmManager = new FilmManager();
		
		filmManager.add(new Film(1,"D Filmi ","Suç , Gerilim",2000,8));
		filmManager.showInfo(film2);
		
		categoryManager.add(new Category(4, "Bilim Kurgu"));
	}
	
}