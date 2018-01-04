package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_191 {
    private val production = Production34_191("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}