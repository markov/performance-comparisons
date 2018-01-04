package org.gradle.test.performance45_4

import org.junit.Assert.*

class Test45_400 {
    private val production = Production45_400("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
