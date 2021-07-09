package Business;

public class ItemPlaylist {
	private String titulo;
	private int duracao;
	
	public ItemPlaylist(String nome, int dur) {
		this.setDuracao(dur);
		this.setTitulo(nome);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "ItemPlaylist [titulo=" + titulo + ", duracao=" + duracao + "]";
	}
	
	
}
