package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_238 {
    private val production = Production45_238("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
