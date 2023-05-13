package model;

import org.junit.jupiter.api.Assertions;

public class ContaTest {
    @Test
    public void deveDepositarComValorValido(){
        Conta conta = new Conta();
        conta.depositar(100);

        Assertions.assertEquals(100, conta.getSaldo());
    }
}
