package org.gradle.test.performance34_4

import org.junit.Assert.*

class Test34_385 {
    private val production = Production34_385("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}