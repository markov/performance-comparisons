package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_288 {
    private val production = Production45_288("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
