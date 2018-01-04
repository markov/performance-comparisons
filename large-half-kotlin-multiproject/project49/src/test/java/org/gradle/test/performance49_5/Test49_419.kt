package org.gradle.test.performance49_5

import org.junit.Assert.*

class Test49_419 {
    private val production = Production49_419("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
