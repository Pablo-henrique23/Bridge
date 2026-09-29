package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonitoramentoTest {

    @Test
    public void deveMonitorarCoracaoComMonitor() {

        Dispositivo dispositivo = new Monitor();

        Monitoramento monitoramento = new MonitoramentoCardiaco(dispositivo);

        assertEquals("Monitoramento cardíaco: Monitorando através de monitor hospitalar", monitoramento.monitorar());
    }

    @Test
    public void deveMonitorarCoracaoComTelemetria() {

        Dispositivo dispositivo = new Telemetria();

        Monitoramento monitoramento = new MonitoramentoCardiaco(dispositivo);

        assertEquals("Monitoramento cardíaco: Monitorando através de telemetria", monitoramento.monitorar()); }

    @Test
    public void deveMonitorarSinaisVitaisComMonitor() {

        Dispositivo dispositivo = new Monitor();

        Monitoramento monitoramento = new MonitoramentoSinaisVitais(dispositivo);

        assertEquals("Monitoramento de sinais vitais: Monitorando através de monitor hospitalar", monitoramento.monitorar()); }

    @Test
    public void deveMonitorarSinaisVitaisComTelemetria() {

        Dispositivo dispositivo = new Telemetria();

        Monitoramento monitoramento =new MonitoramentoSinaisVitais(dispositivo);

        assertEquals("Monitoramento de sinais vitais: Monitorando através de telemetria", monitoramento.monitorar()); }
}