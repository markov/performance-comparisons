package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_164 {
    private val production = Production29_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}