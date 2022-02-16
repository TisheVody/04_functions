import org.junit.Test

import org.junit.Assert.*

class Different_commissionKtTest {

    @Test
    fun getComission_vkPay_branchIf() {
        //arrange
        val cardType = "Vk Pay"
        val sumLastTransfers = 30_000_00
        val currentTransfer = 11_000_00

        //act
        val result = getComission(cardType = cardType, sumLastTransfers = sumLastTransfers, currentTransfer = currentTransfer)

        //assert
        assertEquals(0, result)
    }

    @Test
    fun getComission_vkPay_branchElse() {
        //arrange
        val cardType = "Vk Pay"
        val sumLastTransfers = 30_000_00
        val currentTransfer = 16_000_00

        //act
        val result = getComission(cardType = cardType, sumLastTransfers = sumLastTransfers, currentTransfer = currentTransfer)

        //assert
        assertEquals(-1, result)
    }

    @Test
    fun getComission_visaMir_branchIf() {
        //arrange
        val cardType = "Visa"
        val sumLastTransfers = 300_000_00
        val currentTransfer = 110_000_00

        //act
        val result = getComission(cardType = cardType, sumLastTransfers = sumLastTransfers, currentTransfer = currentTransfer)

        //assert
        assertEquals(825_00, result)
    }

    @Test
    fun getComission_visaMir_branchElse() {
        //arrange
        val cardType = "Мир"
        val sumLastTransfers = 30_000_00
        val currentTransfer = 190_000_00

        //act
        val result = getComission(cardType = cardType, sumLastTransfers = sumLastTransfers, currentTransfer = currentTransfer)

        //assert
        assertEquals(-1, result)
    }

    @Test
    fun getComission_maestroMastercard_branchIf() {
        //arrange
        val cardType = "Maestro"
        val sumLastTransfers = 38_000_00
        val currentTransfer = 13_000_00

        //act
        val result = getComission(cardType = cardType, sumLastTransfers = sumLastTransfers, currentTransfer = currentTransfer)

        //assert
        assertEquals(0, result)
    }

    @Test
    fun getComission_maestroMastercard_branchElse() {
        //arrange
        val cardType = "Mastercard"
        val sumLastTransfers = 700_000_00
        val currentTransfer = 11_000_00

        //act
        val result = getComission(cardType = cardType, sumLastTransfers = sumLastTransfers, currentTransfer = currentTransfer)

        //assert
        assertEquals(-1, result)
    }

    @Test
    fun comissionVisaMir_branchIf() {
        //arrange
        val minCommission = 35_00
        val currentTransfer = 11_000_00

        //act
        val result = comissionVisaMir(currentTransfer = currentTransfer, minCommission = minCommission)

        //assert
        assertEquals(82_50, result)
    }

    @Test
    fun comissionVisaMir_branchElse() {
        //arrange
        val minCommission = 35_00
        val currentTransfer = 100_00

        //act
        val result = comissionVisaMir(currentTransfer = currentTransfer, minCommission = minCommission)

        //assert
        assertEquals(35_00, result)
    }

    @Test
    fun comissionMaestroMastercard_branchElse() {
        //arrange
        val currentTransfer = 11_000_00

        //act
        val result = comissionMaestroMastercard(currentTransfer = currentTransfer)

        //assert
        assertEquals(0, result)
    }

    @Test
    fun comissionMaestroMastercard_branchIf() {
        //arrange
        val currentTransfer = 91_000_00

        //act
        val result = comissionMaestroMastercard(currentTransfer = currentTransfer)

        //assert
        assertEquals(560_00, result)
    }
}