package org.gradle.test.performance34_5

import org.junit.Assert.*

class Test34_441 {
    private val production = Production34_441("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}