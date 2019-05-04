public class News {

	private New notizie[];
	private static final int MAX_NOTIZIE = 10000;
	
	public News() {
		
		notizie = new New[MAX_NOTIZIE];
	}
	
	public News(News news) {
		
		int posizione;
		
		notizie = new New[MAX_NOTIZIE];
		
		for(posizione = 0; posizione < MAX_NOTIZIE; posizione++) {
			
			if(news.getNotizie(posizione) != null) {
				
				notizie[posizione] = news.getNotizie(posizione);
			}
		}
	}
	
	
	
	public void addNews() {
		
		
	}
	
	public New searchNews() {
		
		
	}
	
	public void viewNews() {
		
		
	}
}
