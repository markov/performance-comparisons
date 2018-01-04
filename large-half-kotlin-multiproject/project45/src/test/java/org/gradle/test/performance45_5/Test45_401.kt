package org.gradle.test.performance45_5

import org.junit.Assert.*

class Test45_401 {
    private val production = Production45_401("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
