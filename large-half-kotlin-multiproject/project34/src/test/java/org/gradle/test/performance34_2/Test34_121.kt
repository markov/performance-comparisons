package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_121 {
    private val production = Production34_121("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}