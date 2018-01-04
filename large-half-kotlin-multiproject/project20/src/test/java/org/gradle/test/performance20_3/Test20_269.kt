package org.gradle.test.performance20_3

import org.junit.Assert.*

class Test20_269 {
    private val production = Production20_269("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}