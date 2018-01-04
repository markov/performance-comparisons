package org.gradle.test.performance29_3

import org.junit.Assert.*

class Test29_218 {
    private val production = Production29_218("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}