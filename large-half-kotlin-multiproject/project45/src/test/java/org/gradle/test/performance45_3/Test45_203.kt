package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_203 {
    private val production = Production45_203("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
