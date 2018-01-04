package org.gradle.test.performance18_5

import org.junit.Assert.*

class Test18_466 {
    private val production = Production18_466("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}