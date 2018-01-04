package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_194 {
    private val production = Production29_194("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}