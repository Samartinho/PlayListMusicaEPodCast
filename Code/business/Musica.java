package Business;

import java.util.ArrayList;
import java.util.List;

public class Musica extends ItemPlaylist{
	private List<Artista> playList;
	
	public Musica(String nome, int dur) {
		super(nome, dur);
		this.playList = new ArrayList<Artista>();
	}
	
	public void addArtista(Artista a) {
		this.getPlayList().add(a);
	}
	@Override
	public String toString() {
		return "Musica [playList=" + playList + "]";
	}

	public void  removeArtista(Artista a) {
		this.getPlayList().remove(a);
	}

	public List<Artista> getPlayList() {
		return playList;
	}

	public void setPlayList(List<Artista> playList) {
		this.playList = playList;
	}
	
	
	
}
