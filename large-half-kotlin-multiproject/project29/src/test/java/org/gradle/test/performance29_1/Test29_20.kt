package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_20 {
    private val production = Production29_20("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}