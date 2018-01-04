package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_132 {
    private val production = Production29_132("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}