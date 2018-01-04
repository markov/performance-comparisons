package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_285 {
    private val production = Production45_285("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
