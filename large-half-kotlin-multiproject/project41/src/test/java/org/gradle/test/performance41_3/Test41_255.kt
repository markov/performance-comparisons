package org.gradle.test.performance41_3

import org.junit.Assert.*

class Test41_255 {
    private val production = Production41_255("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
