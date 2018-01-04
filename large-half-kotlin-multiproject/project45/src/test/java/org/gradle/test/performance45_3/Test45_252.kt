package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_252 {
    private val production = Production45_252("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
