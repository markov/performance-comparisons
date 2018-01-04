package org.gradle.test.performance29_5

import org.junit.Assert.*

class Test29_493 {
    private val production = Production29_493("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}