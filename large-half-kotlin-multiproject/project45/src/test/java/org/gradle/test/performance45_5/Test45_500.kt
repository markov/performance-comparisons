package org.gradle.test.performance45_5

import org.junit.Assert.*

class Test45_500 {
    private val production = Production45_500("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
