package org.gradle.test.performance18_5

import org.junit.Assert.*

class Test18_465 {
    private val production = Production18_465("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}