package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_109 {
    private val production = Production34_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}