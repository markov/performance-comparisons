package org.gradle.test.performance34_5

import org.junit.Assert.*

class Test34_500 {
    private val production = Production34_500("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}