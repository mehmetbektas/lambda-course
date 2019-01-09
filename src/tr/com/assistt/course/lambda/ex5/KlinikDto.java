package tr.com.assistt.course.lambda.ex5;

public class KlinikDto {

	private Integer id;
	private Integer klinikKodu;
	private String klinikAdi;
	private Integer kurumId;

	public KlinikDto(Integer id, Integer klinikKodu, String klinikAdi, Integer kurumId) {
		this.id = id;
		this.klinikKodu = klinikKodu;
		this.klinikAdi = klinikAdi;
		this.kurumId = kurumId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getKlinikKodu() {
		return klinikKodu;
	}

	public void setKlinikKodu(Integer klinikKodu) {
		this.klinikKodu = klinikKodu;
	}

	public String getKlinikAdi() {
		return klinikAdi;
	}

	public void setKlinikAdi(String klinikAdi) {
		this.klinikAdi = klinikAdi;
	}

	public Integer getKurumId() {
		return kurumId;
	}

	public void setKurumId(Integer kurumId) {
		this.kurumId = kurumId;
	}

	@Override
	public String toString() {
		return "KlinikDto [id=" + id + ", klinikKodu=" + klinikKodu + ", klinikAdi=" + klinikAdi + ", kurumId="
				+ kurumId + "]";
	}

	
	
}
