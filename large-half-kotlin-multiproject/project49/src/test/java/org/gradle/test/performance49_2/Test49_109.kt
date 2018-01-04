package org.gradle.test.performance49_2

import org.junit.Assert.*

class Test49_109 {
    private val production = Production49_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
