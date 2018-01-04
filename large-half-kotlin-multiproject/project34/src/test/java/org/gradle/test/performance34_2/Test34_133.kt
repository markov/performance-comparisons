package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_133 {
    private val production = Production34_133("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}