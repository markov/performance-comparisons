package org.gradle.test.performance45_1

import org.junit.Assert.*

class Test45_37 {
    private val production = Production45_37("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
