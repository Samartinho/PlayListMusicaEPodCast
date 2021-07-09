package Business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist {
	private List<ItemPlaylist> itens;

	public Playlist()
	{
		this.itens = new ArrayList<ItemPlaylist>();
	}

	public void addItem(ItemPlaylist i) {
		this.getItens().add(i);
	}
	public void removeItem(ItemPlaylist i) {
		this.getItens().remove(i);
	}
	public String visualizarItens() {
		return this.getItens().toString();
	}
	public String visualizarMusicasArtista(Artista a) {
		String valor = null;
		for(ItemPlaylist i : itens) {
			if(i instanceof Musica) {
				if(((Musica) i).getPlayList().contains(a)){
					valor += i.toString();
				}
			}
		}
		return valor;
	}
	public String visualizarPodcastTempo(LocalDate a) {
		String valor = null;
		for(ItemPlaylist i : itens) {
			if(i instanceof Podcast) {
				if(((Podcast) i).getData().equals(a)){
					valor += i.toString();
				}
			}
		}
		return valor;
	}
	public double duracaoMediaPlaylist() {
		int tempo = 0;
		for(ItemPlaylist i : itens) {
			tempo += i.getDuracao();
		}
		return tempo / this.getItens().size();
	}
	public String visualizarMusicas() {
		return this.getItens().stream().filter((m) -> m instanceof Musica).collect(Collectors.toList()).toString();
	}
	public String visualizarPodcasts() {
		return this.getItens().stream().filter((m) -> m instanceof Podcast).collect(Collectors.toList()).toString();
	}

	public List<ItemPlaylist> getItens() {
		return itens;
	}
	public void setItens(List<ItemPlaylist> intens) {
		this.itens = intens;
	}

	@Override
	public String toString() {
		return "Playlist [itens=" + itens + "]";
	}
	
}
