package Business;

import java.time.LocalDate;

public class Podcast extends ItemPlaylist{
	private LocalDate data;
	
	public Podcast(String nome, int dur, LocalDate data) {
		super(nome, dur);
		this.setData(data);
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Podcast [data=" + data + "]";
	}
	
}

