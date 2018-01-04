package org.gradle.test.performance45_4

import org.junit.Assert.*

class Test45_310 {
    private val production = Production45_310("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
