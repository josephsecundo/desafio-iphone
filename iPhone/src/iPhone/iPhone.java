package iPhone;

import services.InternetBrowser;
import services.MusicPlayer;
import services.Phone;

public class iPhone implements Phone, MusicPlayer, InternetBrowser {
	private String model;
	
	public iPhone(String model) {
		this.model = model;
	}

	@Override
	public void browseWeb() {
		System.out.println("Acessando internet " + model);		
	}
	public void NewTab() {
		System.out.println("Abrindo nova aba " + model);
	}
	public void UpdatePage() {
		System.out.println("Atualizando pagina " + model);
	}

	@Override
	public void playMusic() {
		System.out.println("Iniciando musica " + model);
	}
	public void pauseMusic() {
		System.out.println("Pausando musica " + model);
	}
	public void selectMusic() {
		System.out.println("Selecionando musica "  + model);
	}
	@Override
	public void makeCall() {
		System.out.println("Iniciando chamada " + model);
	}
	public void receiveCall() {
		System.out.println("Atendendo chamada " + model);
	}
	public void startVoicemail() {
		System.out.println("Iniciando correio de voz " + model);
	}
}
