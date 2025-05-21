package br.com.alura.screemmatch.model;
import java.time.LocalDate;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();
        this.numeroEpisodio = dadosEpisodio.numero();
        String avaliacaoStr = dadosEpisodio.avaliacao();
        if (avaliacaoStr != null && !avaliacaoStr.equalsIgnoreCase("N/A")){
            try {
                this.avaliacao = Double.valueOf(avaliacaoStr);
            }catch (NumberFormatException e) {
                this.avaliacao = 0.0;
            }
        }else {
            this.avaliacao = 0.0;
        }
        String data = dadosEpisodio.dataLancamento();
        if ( data != null && !data.equalsIgnoreCase("N/A")){
            try {
                this.dataLancamento = LocalDate.parse(data);
            } catch (Exception e){
                this.dataLancamento = null;
            }
        }else {
            this.dataLancamento = null;
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento;
    }
}
