package Aplicacao;

import java.time.LocalDate;

import Business.Artista;
import Business.Musica;
import Business.Playlist;
import Business.Podcast;

public class app {
	public static void main(String[] args) {
		Musica A = new Musica("A", 10);
		Musica B = new Musica("B", 20);
		Musica C = new Musica("C", 25);
		Musica D = new Musica("D", 5);
		Musica E = new Musica("E", 15);
		Artista Gabriel = new Artista("Gabriel");
		LocalDate Date = LocalDate.of(2023, 06, 23);
		A.addArtista(Gabriel);
		B.addArtista(new Artista("Jorge"));
		C.addArtista(new Artista("Rafaela"));
		D.addArtista(new Artista("Thomas"));
		E.addArtista(Gabriel);
		Playlist playlist = new Playlist();
		playlist.addItem(A);
		playlist.addItem(new Podcast("F", 50, LocalDate.of(2021, 06, 23)));
		playlist.addItem(B);
		playlist.addItem(new Podcast("G", 55, LocalDate.of(2022, 06, 23)));
		playlist.addItem(C);
		playlist.addItem(new Podcast("H", 35, LocalDate.of(2021, 07, 23)));
		playlist.addItem(D);
		playlist.addItem(new Podcast("I", 60, LocalDate.of(2021, 06, 30)));
		playlist.addItem(E);
		playlist.addItem(new Podcast("J", 40, Date));
		
		System.out.println(playlist.visualizarItens());
		System.out.println(playlist.visualizarMusicas());
		System.out.println(playlist.visualizarMusicasArtista(Gabriel));
		System.out.println(playlist.visualizarPodcasts());
		System.out.println(playlist.visualizarPodcastTempo(Date));
		playlist.removeItem(A);
		System.out.println(playlist.visualizarMusicas());



	}
}
